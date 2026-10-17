package h7;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh7/n;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lh7/p;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class n extends ModifierNodeElement<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f149818b;

    public n(int i, int i2) {
        this.f149817a = i;
        this.f149818b = i2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        p pVar = new p();
        pVar.f149819a = this.f149817a;
        pVar.f149820b = this.f149818b;
        return pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f149817a == nVar.f149817a && this.f149818b == nVar.f149818b;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (Integer.hashCode(this.f149817a) * 31) + Integer.hashCode(this.f149818b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("Lottie Size");
        inspectorInfo.getProperties().set("width", Integer.valueOf(this.f149817a));
        inspectorInfo.getProperties().set("height", Integer.valueOf(this.f149818b));
    }

    public final String toString() {
        return "LottieAnimationSizeElement(width=" + this.f149817a + ", height=" + this.f149818b + ")";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        p node2 = (p) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.f149819a = this.f149817a;
        node2.f149820b = this.f149818b;
    }
}
