package q75;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242761a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(String str, int i) {
        super(str);
        this.f242761a = i;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.f242761a) {
            case 1:
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
