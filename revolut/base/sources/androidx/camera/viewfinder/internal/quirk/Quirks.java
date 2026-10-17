package androidx.camera.viewfinder.internal.quirk;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class Quirks {

    @NonNull
    private final List<Quirk> mQuirks;

    public Quirks(@NonNull List<Quirk> list) {
        this.mQuirks = new ArrayList(list);
    }

    public <T extends Quirk> T get(@NonNull Class<T> cls) {
        Iterator<Quirk> it8 = this.mQuirks.iterator();
        while (it8.hasNext()) {
            T t2 = (T) it8.next();
            if (t2.getClass() == cls) {
                return t2;
            }
        }
        return null;
    }
}
