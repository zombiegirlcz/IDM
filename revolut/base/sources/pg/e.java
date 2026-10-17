package pg;

import java.sql.Timestamp;
import java.util.Date;
import mg.g;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f235787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Class cls, int i) {
        super(cls);
        this.f235787c = i;
    }

    @Override // mg.g
    public final Date a(Date date) {
        switch (this.f235787c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
