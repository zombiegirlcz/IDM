package gkm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes14.dex */
public final class h extends DelegatingSimpleTypeImpl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f144524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SimpleType delegate, int i) {
        super(delegate);
        this.f144524c = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                super(delegate);
                break;
            default:
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                break;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        switch (this.f144524c) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType replaceDelegate(SimpleType delegate) {
        switch (this.f144524c) {
            case 0:
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return new h(delegate, 0);
            default:
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return new h(delegate, 1);
        }
    }
}
