package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o0;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmClassExtension implements KmClassExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final KmExtensionType e = new KmExtensionType(o0.f186429a.b(JvmClassExtension.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f186841a = new ArrayList(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f186842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f186843c;
    public int d;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KmExtensionType getTYPE() {
            return JvmClassExtension.e;
        }
    }

    public final String getAnonymousObjectOriginName() {
        return this.f186843c;
    }

    public final int getJvmFlags() {
        return this.d;
    }

    @NotNull
    public final List<KmProperty> getLocalDelegatedProperties() {
        return this.f186841a;
    }

    public final String getModuleName() {
        return this.f186842b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return e;
    }

    public final void setAnonymousObjectOriginName(String str) {
        this.f186843c = str;
    }

    public final void setJvmFlags(int i) {
        this.d = i;
    }

    public final void setModuleName(String str) {
        this.f186842b = str;
    }
}
