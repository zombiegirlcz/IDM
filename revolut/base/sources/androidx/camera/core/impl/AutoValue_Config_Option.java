package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import com.revolut.data.database.models.openbanking.d;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_Config_Option<T> extends Config.Option<T> {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f6861id;
    private final Object token;
    private final Class<T> valueClass;

    public AutoValue_Config_Option(String str, Class<T> cls, Object obj2) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f6861id = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.valueClass = cls;
        this.token = obj2;
    }

    public boolean equals(Object obj2) {
        Object obj3;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof Config.Option) {
            Config.Option option = (Config.Option) obj2;
            if (this.f6861id.equals(option.getId()) && this.valueClass.equals(option.getValueClass()) && ((obj3 = this.token) != null ? obj3.equals(option.getToken()) : option.getToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public String getId() {
        return this.f6861id;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public Object getToken() {
        return this.token;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public Class<T> getValueClass() {
        return this.valueClass;
    }

    public int hashCode() {
        int iHashCode = (((this.f6861id.hashCode() ^ 1000003) * 1000003) ^ this.valueClass.hashCode()) * 1000003;
        Object obj2 = this.token;
        return iHashCode ^ (obj2 == null ? 0 : obj2.hashCode());
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("Option{id=");
        sb6.append(this.f6861id);
        sb6.append(", valueClass=");
        sb6.append(this.valueClass);
        sb6.append(", token=");
        return d.t(sb6, this.token, "}");
    }
}
