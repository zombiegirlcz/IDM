package cli;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f25032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f25033b;

    @Override // cli.r
    public final void a(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!b()) {
            action.invoke();
            return;
        }
        ArrayList arrayList = this.f25033b;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f25033b = arrayList;
        }
        arrayList.add(action);
    }

    @Override // cli.r
    public final boolean b() {
        return Intrinsics.f(this.f25032a, Boolean.TRUE);
    }

    public final void c() {
        this.f25032a = null;
        ArrayList arrayList = this.f25033b;
        this.f25033b = null;
        if (arrayList != null) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                ((Function0) it8.next()).invoke();
            }
        }
    }

    public final void d(boolean z) {
        this.f25032a = null;
        if (z) {
            ArrayList arrayList = this.f25033b;
            this.f25033b = null;
            if (arrayList != null) {
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    ((Function0) it8.next()).invoke();
                }
            }
        }
    }

    public final void e(boolean z) {
        this.f25032a = Boolean.valueOf(z);
    }
}
