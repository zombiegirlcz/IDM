package l7;

import g7.j;
import g7.o;
import g7.r;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c9.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f192415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(List list, int i) {
        super(list);
        this.f192415c = i;
    }

    @Override // l7.g
    public final g7.e a() {
        switch (this.f192415c) {
            case 0:
                return new g7.f((List) this.f22248b, 0);
            case 1:
                return new g7.f((List) this.f22248b, 1);
            case 2:
                return new j((List) this.f22248b, 1);
            case 3:
                return new o((List) this.f22248b);
            default:
                return new r((List) this.f22248b);
        }
    }
}
