package b9;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f13460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f13462c = null;
    public ArrayList d = null;

    public s(g gVar, String str) {
        this.f13460a = null;
        this.f13461b = null;
        this.f13460a = gVar == null ? g.DESCENDANT : gVar;
        this.f13461b = str;
    }

    public final void a(String str, d dVar, String str2) {
        if (this.f13462c == null) {
            this.f13462c = new ArrayList();
        }
        this.f13462c.add(new c(str, dVar, str2));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        g gVar = g.CHILD;
        g gVar2 = this.f13460a;
        if (gVar2 == gVar) {
            sb6.append("> ");
        } else if (gVar2 == g.FOLLOWS) {
            sb6.append("+ ");
        }
        String str = this.f13461b;
        if (str == null) {
            str = "*";
        }
        sb6.append(str);
        ArrayList<c> arrayList = this.f13462c;
        if (arrayList != null) {
            for (c cVar : arrayList) {
                sb6.append('[');
                String str2 = cVar.f13314a;
                String str3 = cVar.f13316c;
                sb6.append(str2);
                int i = b.f13307a[cVar.f13315b.ordinal()];
                if (i == 1) {
                    sb6.append('=');
                    sb6.append(str3);
                } else if (i == 2) {
                    sb6.append("~=");
                    sb6.append(str3);
                } else if (i == 3) {
                    sb6.append("|=");
                    sb6.append(str3);
                }
                sb6.append(']');
            }
        }
        ArrayList<i> arrayList2 = this.d;
        if (arrayList2 != null) {
            for (i iVar : arrayList2) {
                sb6.append(CoreConstants.COLON_CHAR);
                sb6.append(iVar);
            }
        }
        return sb6.toString();
    }
}
