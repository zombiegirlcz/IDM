package e8;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p {
    public final /* synthetic */ int e;

    @Override // e8.p
    public final boolean a() {
        switch (this.e) {
        }
        return true;
    }

    @Override // e8.p
    public final boolean b() {
        switch (this.e) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return false;
            default:
                return true;
        }
    }

    @Override // e8.p
    public final boolean c(c8.a aVar) {
        switch (this.e) {
            case 0:
                if (aVar == c8.a.REMOTE) {
                }
                break;
            case 1:
                break;
            case 2:
                if (aVar == c8.a.DATA_DISK_CACHE || aVar == c8.a.MEMORY_CACHE) {
                }
                break;
            default:
                if (aVar == c8.a.REMOTE) {
                }
                break;
        }
        return false;
    }

    @Override // e8.p
    public final boolean d(boolean z, c8.a aVar, c8.c cVar) {
        switch (this.e) {
            case 0:
                if (aVar == c8.a.RESOURCE_DISK_CACHE || aVar == c8.a.MEMORY_CACHE) {
                }
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                if (((!z || aVar != c8.a.DATA_DISK_CACHE) && aVar != c8.a.LOCAL) || cVar != c8.c.TRANSFORMED) {
                }
                break;
        }
        return false;
    }
}
