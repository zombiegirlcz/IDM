package b9;

/* JADX INFO: loaded from: classes16.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13379a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b9.i
    public final boolean a(s1 s1Var) {
        switch (this.f13379a) {
            case 0:
                if (!(s1Var instanceof q1) || ((q1) s1Var).getChildren().size() == 0) {
                }
                break;
            case 1:
                if (s1Var.f13480b == null) {
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (this.f13379a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
