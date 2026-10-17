package xe0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f304514a = new LinkedHashSet();

    @Override // od0.e
    public final synchronized void clear() {
        Iterator it8 = this.f304514a.iterator();
        while (it8.hasNext()) {
            try {
                ((od0.e) it8.next()).clear();
                Unit unit = Unit.f186387a;
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
        this.f304514a.clear();
    }
}
