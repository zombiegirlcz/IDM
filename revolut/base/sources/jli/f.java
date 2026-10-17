package jli;

import androidx.media3.common.TrackGroup;
import com.revolut.RevolutApplication;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import com.revolut.data.model.Data;
import com.revolut.feature.in_app_calls.ActiveCallData;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import com.revolut.retail.core.navigation.BaseFragmentNavigateCommand;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FinishFragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import do3.n;
import efm.r;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.d0;
import kotlinx.serialization.KSerializer;
import no.e1;
import nwl.i;
import org.joda.time.LocalDate;
import qlm.g1;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175846a;

    public /* synthetic */ f(int i) {
        this.f175846a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object params) {
        switch (this.f175846a) {
            case 0:
                Byte b4 = (Byte) params;
                b4.byteValue();
                return a0.d.v(new Object[]{b4}, 1, "%02x", "format(...)");
            case 1:
                Pair pair = (Pair) params;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Boolean.valueOf(((TrackGroup) pair.f186386b).length == 0);
            case 2:
                Pair pair2 = (Pair) params;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new Pair(Integer.valueOf(((Number) pair2.f186385a).intValue()), ((TrackGroup) pair2.f186386b).getFormat(0));
            case 3:
                rp0.c result = (rp0.c) params;
                Intrinsics.checkNotNullParameter(result, "result");
                return new kii.d(result.b(), result.c(), result.a());
            case 4:
                kl0.b args = (kl0.b) params;
                kl0.c cVar = kl0.c.d;
                Intrinsics.checkNotNullParameter(args, "args");
                gl0.a aVar = args.f185260a;
                aVar.getClass();
                return new kl0.a(aVar);
            case 5:
                CharSequence it8 = (CharSequence) params;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.toString();
            case 6:
                Intrinsics.checkNotNullParameter((Unit) params, "it");
                return new ku1.b();
            case 7:
                a0.d.B(params);
                Intrinsics.checkNotNullParameter(null, "args");
                throw null;
            case 8:
                RevolutApplication.a aVar2 = RevolutApplication.Companion;
                gom.e.f145194a.e((Throwable) params);
                return Unit.f186387a;
            case 9:
                NaviCommand command = (NaviCommand) params;
                Intrinsics.checkNotNullParameter(command, "command");
                if (command instanceof CompositeCommand) {
                    List<NaviCommand> list = ((CompositeCommand) command).f98629a;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (NaviCommand naviCommand : list) {
                            if (!(naviCommand instanceof BaseFragmentNavigateCommand) && !(naviCommand instanceof DummyCommand) && !(naviCommand instanceof FinishFragmentNavigateCommand)) {
                                z = true;
                            }
                        }
                    }
                } else if (!(command instanceof BaseFragmentNavigateCommand) && !(command instanceof DummyCommand) && !(command instanceof FinishFragmentNavigateCommand)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                sk0.b it9 = (sk0.b) params;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f263747a;
            case 11:
                KClass it10 = (KClass) params;
                Intrinsics.checkNotNullParameter(it10, "it");
                KSerializer kSerializerW = jh.d.w(it10);
                if (kSerializerW != null) {
                    return kSerializerW;
                }
                if (g1.c(it10)) {
                    return new mlm.d(it10);
                }
                return null;
            case 12:
                KClass it11 = (KClass) params;
                Intrinsics.checkNotNullParameter(it11, "it");
                KSerializer kSerializerW2 = jh.d.w(it11);
                if (kSerializerW2 == null) {
                    kSerializerW2 = g1.c(it11) ? new mlm.d(it11) : null;
                }
                if (kSerializerW2 != null) {
                    return nlm.a.c(kSerializerW2);
                }
                return null;
            case 13:
                n user = (n) params;
                Intrinsics.checkNotNullParameter(user, "user");
                String str = user.f116410c;
                String str2 = user.e;
                LocalDate localDate = user.f116413j;
                return new p7l.a(str, str2, localDate != null ? b.e(localDate) : null);
            case 14:
                al0.a state = (al0.a) params;
                Intrinsics.checkNotNullParameter(state, "state");
                int i = mpi.c.f207817a[state.ordinal()];
                if (i == 1) {
                    return r.just(state).delay(3L, TimeUnit.SECONDS);
                }
                if (i == 2) {
                    return r.just(state);
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                ((Integer) params).intValue();
                HorizontalStepsProgressView.Companion aVar3 = HorizontalStepsProgressView.INSTANCE;
                return Unit.f186387a;
            case 16:
                ActiveCallData activeCallDataB = ((InAppCallStateWithData) params).getF();
                if (activeCallDataB != null) {
                    return activeCallDataB.getF74772b();
                }
                return null;
            case 17:
                return Boolean.valueOf(params == null);
            case 18:
                MatchResult it12 = (MatchResult) params;
                Regex regex = e1.f217762a;
                Intrinsics.checkNotNullParameter(it12, "it");
                String lowerCase = it12.getValue().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return lowerCase;
            case 19:
                Map properties = (Map) params;
                String str3 = "Track user properties event " + properties;
                try {
                    Intrinsics.h(properties);
                    Intrinsics.checkNotNullParameter(properties, "properties");
                    break;
                } catch (Throwable th10) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.ERROR, null, str3 != null ? "Failed to do action: ".concat(str3) : null, th10, null, 16);
                }
                return Unit.f186387a;
            case 20:
                n profile = (n) params;
                Intrinsics.checkNotNullParameter(profile, "profile");
                return profile.f116415m;
            case 21:
                Throwable th11 = (Throwable) params;
                Intrinsics.h(th11);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Analytics", null, th11, h0Var);
                return Unit.f186387a;
            case 22:
                Throwable th12 = (Throwable) params;
                Intrinsics.h(th12);
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "Analytics", null, th12, h0Var2);
                return Unit.f186387a;
            case 23:
                Boolean empty = (Boolean) params;
                Intrinsics.checkNotNullParameter(empty, "empty");
                return Boolean.valueOf(!empty.booleanValue());
            case 24:
                m0j.a onboardingState = (m0j.a) params;
                Intrinsics.checkNotNullParameter(onboardingState, "onboardingState");
                int i2 = i.f220020b[onboardingState.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    z = true;
                } else if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 25:
                String str4 = (String) params;
                return Boolean.valueOf(str4 == null || d0.W(str4));
            case 26:
                Data remoteStoryData = (Data) params;
                Intrinsics.checkNotNullParameter(remoteStoryData, "remoteStoryData");
                return new Data((mza.d) remoteStoryData.getContent(), remoteStoryData.getError() != pza.g.f240922g ? remoteStoryData.getError() : null, remoteStoryData.getLoading());
            case 27:
                Intrinsics.checkNotNullParameter(params, "<unused var>");
                return Unit.f186387a;
            case 28:
                Intrinsics.checkNotNullParameter(params, "params");
                return params.toString();
            default:
                List params2 = (List) params;
                Intrinsics.checkNotNullParameter(params2, "params");
                return zhm.d0.b0(params2);
        }
    }
}
