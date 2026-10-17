package b9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public final class o implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13424b;

    public o(boolean z, String str) {
        this.f13423a = z;
        this.f13424b = str;
    }

    @Override // b9.i
    public final boolean a(s1 s1Var) {
        int i;
        boolean z = this.f13423a;
        String strM = this.f13424b;
        if (z && strM == null) {
            strM = s1Var.m();
        }
        q1 q1Var = s1Var.f13480b;
        if (q1Var != null) {
            Iterator it8 = q1Var.getChildren().iterator();
            i = 0;
            while (it8.hasNext()) {
                s1 s1Var2 = (s1) ((u1) it8.next());
                if (strM == null || s1Var2.m().equals(strM)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.f13423a ? p.a.p("only-of-type <", this.f13424b, ">") : "only-child";
    }
}
