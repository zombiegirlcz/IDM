package f8;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132665a;

    public final int a(Object obj2) {
        switch (this.f132665a) {
            case 0:
                return ((byte[]) obj2).length;
            default:
                return ((int[]) obj2).length;
        }
    }

    public final int b() {
        switch (this.f132665a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final String c() {
        switch (this.f132665a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }

    public final Object d(int i) {
        switch (this.f132665a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }
}
