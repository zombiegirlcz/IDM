package androidx.glance.action;

import androidx.glance.action.ActionParameters;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR.\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Landroidx/glance/action/MutableActionParameters;", "Landroidx/glance/action/ActionParameters;", "", "Landroidx/glance/action/ActionParameters$Key;", "", "map", "<init>", "(Ljava/util/Map;)V", "T", "key", "get", "(Landroidx/glance/action/ActionParameters$Key;)Ljava/lang/Object;", "", "asMap", "()Ljava/util/Map;", "value", "set", "(Landroidx/glance/action/ActionParameters$Key;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getMap$glance_release", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableActionParameters extends ActionParameters {

    @NotNull
    private final Map<ActionParameters.Key<? extends Object>, Object> map;

    public MutableActionParameters(@NotNull Map<ActionParameters.Key<? extends Object>, Object> map) {
        this.map = map;
    }

    @Override // androidx.glance.action.ActionParameters
    @NotNull
    public Map<ActionParameters.Key<? extends Object>, Object> asMap() {
        return Collections.unmodifiableMap(this.map);
    }

    public boolean equals(Object other) {
        return (other instanceof MutableActionParameters) && Intrinsics.f(this.map, ((MutableActionParameters) other).map);
    }

    public <T> T get(@NotNull ActionParameters.Key<T> key) {
        return (T) this.map.get(key);
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public final <T> T remove(@NotNull ActionParameters.Key<T> key) {
        return (T) this.map.remove(key);
    }

    public final <T> T set(@NotNull ActionParameters.Key<T> key, T value) {
        T t2 = (T) get(key);
        if (value == null) {
            remove(key);
            return t2;
        }
        this.map.put(key, value);
        return t2;
    }

    @NotNull
    public String toString() {
        return this.map.toString();
    }
}
