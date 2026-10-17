package e1;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.ui.node.TraversableNode;
import hoi.n;
import joi.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f121774b;

    public /* synthetic */ f(Ref$BooleanRef ref$BooleanRef, int i) {
        this.f121773a = i;
        this.f121774b = ref$BooleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f121773a) {
            case 0:
                return Boolean.valueOf(ClickableKt.hasScrollableContainer$lambda$0(this.f121774b, (TraversableNode) obj2));
            case 1:
                Ref$BooleanRef ref$BooleanRef = this.f121774b;
                long j2 = ref$BooleanRef.f186407a ? 0L : 400L;
                ref$BooleanRef.f186407a = false;
                return Long.valueOf(j2);
            case 2:
                u sectionAnimation = (u) obj2;
                Intrinsics.checkNotNullParameter(sectionAnimation, "sectionAnimation");
                this.f121774b.f186407a = true;
                if (sectionAnimation.d.equals(n.c.f154336c)) {
                    sectionAnimation.a(true, false, true);
                } else {
                    sectionAnimation.a(true, true, false);
                }
                return Unit.f186387a;
            case 3:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f121774b.f186407a = true;
                return Unit.f186387a;
            case 4:
                return SelectionLayoutKt.isCollapsed$lambda$0(this.f121774b, (SelectableInfo) obj2);
            default:
                Ref$BooleanRef ref$BooleanRef2 = this.f121774b;
                long j3 = ref$BooleanRef2.f186407a ? 0L : 400L;
                ref$BooleanRef2.f186407a = false;
                return Long.valueOf(j3);
        }
    }
}
