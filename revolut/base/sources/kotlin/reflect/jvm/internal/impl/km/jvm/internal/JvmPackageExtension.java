package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o0;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmPackageExtension implements KmPackageExtension {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final KmExtensionType TYPE = new KmExtensionType(o0.f186429a.b(JvmPackageExtension.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f186848a = new ArrayList(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f186849b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @NotNull
    public final List<KmProperty> getLocalDelegatedProperties() {
        return this.f186848a;
    }

    public final String getModuleName() {
        return this.f186849b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
    @NotNull
    public KmExtensionType getType() {
        return TYPE;
    }

    public final void setModuleName(String str) {
        this.f186849b = str;
    }
}
