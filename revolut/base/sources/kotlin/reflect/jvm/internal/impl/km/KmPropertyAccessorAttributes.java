package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmPropertyAccessorAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f186800b;

    public KmPropertyAccessorAttributes(int i) {
        this.f186799a = i;
        this.f186800b = new ArrayList(0);
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.f186800b;
    }

    public final int getFlags$kotlin_metadata() {
        return this.f186799a;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.f186799a = i;
    }

    public KmPropertyAccessorAttributes() {
        this(0);
    }
}
