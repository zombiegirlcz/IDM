package xf;

import com.google.protobuf.c1;

/* JADX INFO: loaded from: classes.dex */
public final class m implements c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f304732b = new m(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f304733c = new m(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304734a;

    public /* synthetic */ m(int i) {
        this.f304734a = i;
    }

    @Override // com.google.protobuf.c1
    public final boolean isInRange(int i) {
        switch (this.f304734a) {
            case 0:
                if (n.a(i) != null) {
                }
                break;
            default:
                if (o0.a(i) != null) {
                }
                break;
        }
        return false;
    }
}
