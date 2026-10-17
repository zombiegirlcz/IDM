package bkm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StaticScopeForKotlinEnum f16437b;

    public /* synthetic */ c(StaticScopeForKotlinEnum staticScopeForKotlinEnum, int i) {
        this.f16436a = i;
        this.f16437b = staticScopeForKotlinEnum;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f16436a;
        StaticScopeForKotlinEnum staticScopeForKotlinEnum = this.f16437b;
        switch (i) {
            case 0:
                return v.k(DescriptorFactory.createEnumValueOfMethod(staticScopeForKotlinEnum.f187623a), DescriptorFactory.createEnumValuesMethod(staticScopeForKotlinEnum.f187623a));
            default:
                return staticScopeForKotlinEnum.f187624b ? v.l(DescriptorFactory.createEnumEntriesProperty(staticScopeForKotlinEnum.f187623a)) : f0.f322471a;
        }
    }
}
