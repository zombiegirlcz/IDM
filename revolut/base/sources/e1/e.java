package e1;

import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.f3;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kp0.i0;
import kp0.j0;
import le.u1;
import mq4.q;
import mq4.x;
import wim.z;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f121771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f121772c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(long j2, Object obj2, Serializable serializable, Object obj3, int i) {
        this.f121770a = i;
        this.f121771b = j2;
        this.f121772c = obj2;
        this.d = serializable;
        this.e = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d dVar;
        int i = this.f121770a;
        int i2 = 3;
        long j2 = this.f121771b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f121772c;
        switch (i) {
            case 0:
                return BorderModifierNode.drawGenericBorder$lambda$3((Rect) obj5, (Ref$ObjectRef) obj4, this.f121771b, (ColorFilter) obj3, (ContentDrawScope) obj2);
            case 1:
                final gd8.h hVar = (gd8.h) obj5;
                final String str = (String) obj4;
                final wc8.a aVar = (wc8.a) obj3;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                RuntimeException runtimeException = new RuntimeException("Cannot deliver consent state", error);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
                final long j3 = this.f121771b;
                pfm.h hVar2 = new pfm.h(new kfm.a() { // from class: gd8.e
                    @Override // kfm.a
                    public final void run() {
                        h hVar3 = hVar;
                        String str2 = str;
                        wc8.a aVar2 = aVar;
                        long j5 = j3;
                        synchronized (hVar3) {
                            try {
                                ue0.c cVar = hVar3.f143086b;
                                Type JUNIOR_CONSENT_PROMPT_STATES_TYPE = h.d;
                                Intrinsics.checkNotNullExpressionValue(JUNIOR_CONSENT_PROMPT_STATES_TYPE, "JUNIOR_CONSENT_PROMPT_STATES_TYPE");
                                Map map = (Map) cVar.T2("CACHE_KEY_JUNIOR_CONSENT_PROMPT_STATES", JUNIOR_CONSENT_PROMPT_STATES_TYPE);
                                LinkedHashMap linkedHashMapZ = map != null ? r0.z(map) : new LinkedHashMap();
                                linkedHashMapZ.put(str2, new ed8.b(str2, u1.g(aVar2, hx7.l.k()), j5));
                                ue0.c cVar2 = hVar3.f143086b;
                                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                                KType kTypeB = o0.b(String.class);
                                companion.getClass();
                                cVar2.G(linkedHashMapZ, "CACHE_KEY_JUNIOR_CONSENT_PROMPT_STATES", z.d(o0.f186429a.d(o0.d(KTypeProjection.Companion.a(kTypeB), KTypeProjection.Companion.a(o0.b(ed8.b.class))))));
                                Unit unit = Unit.f186387a;
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            case 2:
                j0 j0Var = (j0) obj5;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                Function0 function0 = (Function0) obj3;
                long j5 = j0Var.f;
                LottieAnimationView lottieAnimationView = j0Var.f188024a;
                if (j2 != j5) {
                    return Unit.f186387a;
                }
                ref$BooleanRef.f186407a = true;
                i0 i0Var = new i0(j0Var, j2, function0);
                j0Var.d = i0Var;
                lottieAnimationView.addAnimatorListener(i0Var);
                lottieAnimationView.setProgress(BitmapDescriptorFactory.HUE_RED);
                lottieAnimationView.playAnimation();
                return Unit.f186387a;
            case 3:
                String str2 = (String) obj5;
                CreditCardSecurityDeposit creditCardSecurityDeposit = (CreditCardSecurityDeposit) obj4;
                mq4.g update = (mq4.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                xi0.b bVar = creditCardSecurityDeposit.f68756c;
                long j16 = creditCardSecurityDeposit.f68755b;
                dj0.d dVar2 = new dj0.d(j2, bVar);
                int i3 = q.f207871a[((x) obj3).v.f69168c.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    dVar = new dj0.d(j2 + j16, bVar);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = new dj0.d(j16 - j2, bVar);
                }
                return mq4.g.a(update, null, str2, dVar2, dVar, 3);
            case 4:
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                com.bumptech.glide.c.x(buildStruct, "name", (String) obj5);
                com.bumptech.glide.c.x(buildStruct, "result", (String) obj4);
                com.bumptech.glide.c.w(buildStruct, "duration", Long.valueOf(j2));
                com.bumptech.glide.c.x(buildStruct, "reason", (String) obj3);
                return Unit.f186387a;
            case 5:
                com.revolut.analytics.tracking.v3.f fVar = (com.revolut.analytics.tracking.v3.f) obj3;
                f3 buildStruct2 = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct2, "$this$buildStruct");
                com.bumptech.glide.c.x(buildStruct2, "screen_name", ((uo.o0) obj5).f281496a);
                com.bumptech.glide.c.w(buildStruct2, "data_display_duration", Long.valueOf(j2));
                for (Map.Entry entry : (aim.k) ((aim.f) obj4).entrySet()) {
                    String str3 = (String) entry.getKey();
                    Object value = entry.getValue();
                    fVar.getClass();
                    com.revolut.analytics.tracking.v3.f.c(buildStruct2, str3, value);
                }
                return Unit.f186387a;
            case 6:
                jpf.a aVar2 = (jpf.a) obj5;
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((w4l.f) aVar2.f177268b).e(obj4, (w4l.k) obj3).takeUntil(new qe0.g(i2, new qc7.c(17))).map(new qe0.g(4, new qc7.c(18))).concatWith(((qe0.f) aVar2.f177269c).a(obj4, j2, false));
            default:
                return MultiParagraph.fillBoundingBoxes_8ffj60Q$lambda$0(this.f121771b, (float[]) obj5, (Ref$IntRef) obj4, (m0) obj3, (ParagraphInfo) obj2);
        }
    }

    public /* synthetic */ e(Object obj2, long j2, Object obj3, Object obj4, int i) {
        this.f121770a = i;
        this.f121772c = obj2;
        this.f121771b = j2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ e(Object obj2, Serializable serializable, long j2, Object obj3, int i) {
        this.f121770a = i;
        this.f121772c = obj2;
        this.d = serializable;
        this.f121771b = j2;
        this.e = obj3;
    }

    public /* synthetic */ e(Object obj2, Object obj3, Object obj4, long j2, int i) {
        this.f121770a = i;
        this.f121772c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f121771b = j2;
    }
}
