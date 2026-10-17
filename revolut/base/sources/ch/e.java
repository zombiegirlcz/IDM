package ch;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Map f24017zza = new HashMap();

    public abstract Object create(Object obj2);

    @NonNull
    @KeepForSdk
    public Object get(@NonNull Object obj2) {
        synchronized (this.f24017zza) {
            try {
                if (this.f24017zza.containsKey(obj2)) {
                    return this.f24017zza.get(obj2);
                }
                Object objCreate = create(obj2);
                this.f24017zza.put(obj2, objCreate);
                return objCreate;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
