package f8;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c9.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f132672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i) {
        super(1);
        this.f132672c = i;
    }

    public final h o() {
        switch (this.f132672c) {
            case 0:
                return new d(this);
            default:
                return new j(this);
        }
    }
}
