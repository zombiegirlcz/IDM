package kotlin.reflect.jvm.internal.impl.descriptors;

import ajm.d;
import ajm.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassDescriptor f186540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f186541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KotlinTypeRefiner f186542c;
    public final NotNullLazyValue d;
    public static final /* synthetic */ KProperty[] e = {o0.f186429a.j(new h0(ScopesHolderForClass.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final <T extends MemberScope> ScopesHolderForClass<T> create(@NotNull ClassDescriptor classDescriptor, @NotNull StorageManager storageManager, @NotNull KotlinTypeRefiner kotlinTypeRefinerForOwnerModule, @NotNull Function1<? super KotlinTypeRefiner, ? extends T> scopeFactory) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
            return new ScopesHolderForClass<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }
    }

    public ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1 function1, KotlinTypeRefiner kotlinTypeRefiner, DefaultConstructorMarker defaultConstructorMarker) {
        this.f186540a = classDescriptor;
        this.f186541b = function1;
        this.f186542c = kotlinTypeRefiner;
        this.d = storageManager.createLazyValue(new d(this, 7));
    }

    @NotNull
    public final T getScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        ClassDescriptor classDescriptor = this.f186540a;
        boolean zIsRefinementNeededForModule = kotlinTypeRefiner.isRefinementNeededForModule(DescriptorUtilsKt.getModule(classDescriptor));
        KProperty[] kPropertyArr = e;
        NotNullLazyValue notNullLazyValue = this.d;
        if (!zIsRefinementNeededForModule) {
            return (T) StorageKt.getValue(notNullLazyValue, this, kPropertyArr[0]);
        }
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.isRefinementNeededForTypeConstructor(typeConstructor) ? (T) StorageKt.getValue(notNullLazyValue, this, kPropertyArr[0]) : (T) kotlinTypeRefiner.getOrPutScopeForClass(classDescriptor, new e(this, kotlinTypeRefiner, 6));
    }
}
