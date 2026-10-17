package y07;

import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.material3.internal.ChildSemanticsNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import u10.q;
import zh9.i0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310167a;

    public /* synthetic */ m(int i) {
        this.f310167a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i0 i0Var;
        zh9.i iVar;
        zh9.h hVar;
        switch (this.f310167a) {
            case 0:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new j((List) getDefaultLoadingItems.invoke());
            case 1:
                y0b.f update = (y0b.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return y0b.f.a(update, null, null, null, true, 31);
            case 2:
                g0b.c chartDomainState = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(chartDomainState, "chartDomainState");
                return chartDomainState;
            case 3:
                y0b.f state = (y0b.f) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return state.d.d;
            case 4:
                y0b.f update2 = (y0b.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return y0b.f.a(update2, null, null, null, false, 31);
            case 5:
                y0b.f state2 = (y0b.f) obj2;
                Intrinsics.checkNotNullParameter(state2, "state");
                return state2.d.d;
            case 6:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return null;
            case 7:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return null;
            case 8:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return w.u(it10);
            case 9:
                return ChildParentSemanticsKt.childSemantics$lambda$0((SemanticsPropertyReceiver) obj2);
            case 10:
                return Boolean.valueOf(ChildSemanticsNode.onDetach$lambda$2((TraversableNode) obj2));
            case 11:
                k20.a tag2 = (k20.a) obj2;
                Intrinsics.checkNotNullParameter(tag2, "tag");
                return j6.a.s("{tag=", tag2.getTag(), ", label=", tag2.getLabel(), "}");
            case 12:
                ((Integer) obj2).intValue();
                return m70.a.o(t0.f186434a);
            case 13:
                ((Integer) obj2).getClass();
                return " ";
            case 14:
                q it11 = (q) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f276319c;
            case 15:
                q it12 = (q) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f276318b;
            case 16:
                q it13 = (q) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f276317a.toString();
            case 17:
                q it14 = (q) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f276318b;
            case 18:
                q it15 = (q) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f276317a.toString();
            case 19:
                q it16 = (q) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f276319c;
            case 20:
                q it17 = (q) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f276318b;
            case 21:
                q it18 = (q) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f276317a.toString();
            case 22:
                q it19 = (q) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Integer.valueOf(it19.f276321h);
            case 23:
                q it20 = (q) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Integer.valueOf(it20.i);
            case 24:
                q it21 = (q) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Integer.valueOf(it21.f276322j);
            case 25:
                u10.h it22 = (u10.h) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f;
            case 26:
                u10.h it23 = (u10.h) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return it23.f276283b;
            case 27:
                u10.h it24 = (u10.h) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return it24.f276282a.toString();
            case 28:
                od0.i optional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optional, "optional");
                Boolean bool = (Boolean) optional.g();
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            default:
                Data management = (Data) obj2;
                Intrinsics.checkNotNullParameter(management, "management");
                od0.i iVar2 = (od0.i) management.getContent();
                return Boolean.valueOf(((iVar2 == null || (i0Var = (i0) iVar2.f224257a) == null || (iVar = i0Var.f322286b) == null || (hVar = iVar.f) == null) ? null : hVar.f322278r) == zh9.g.TOTAL_OWED);
        }
    }
}
