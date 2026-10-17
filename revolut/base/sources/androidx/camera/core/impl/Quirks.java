package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class Quirks {
    private final List<Quirk> mQuirks;

    public Quirks(List<Quirk> list) {
        this.mQuirks = new ArrayList(list);
    }

    public static String toString(Quirks quirks) {
        ArrayList arrayList = new ArrayList();
        Iterator<Quirk> it8 = quirks.mQuirks.iterator();
        while (it8.hasNext()) {
            arrayList.add(it8.next().getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public boolean contains(Class<? extends Quirk> cls) {
        Iterator<Quirk> it8 = this.mQuirks.iterator();
        while (it8.hasNext()) {
            if (cls.isAssignableFrom(it8.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends Quirk> T get(Class<T> cls) {
        Iterator<Quirk> it8 = this.mQuirks.iterator();
        while (it8.hasNext()) {
            T t2 = (T) it8.next();
            if (t2.getClass() == cls) {
                return t2;
            }
        }
        return null;
    }

    public <T extends Quirk> List<T> getAll(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (Quirk quirk : this.mQuirks) {
            if (cls.isAssignableFrom(quirk.getClass())) {
                arrayList.add(quirk);
            }
        }
        return arrayList;
    }
}
