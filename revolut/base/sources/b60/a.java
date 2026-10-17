package b60;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f12526a;

    public abstract Object a();

    public final Object b() {
        if (this.f12526a == null) {
            synchronized (this) {
                try {
                    if (this.f12526a == null) {
                        ArrayList arrayList = i.f12527a;
                        i.a("Create component in holder ".concat(getClass().getSimpleName()));
                        this.f12526a = a();
                    }
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
        return this.f12526a;
    }
}
