package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TypeSubstitutor f186676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FunctionDescriptorImpl f186677b;

    public a(FunctionDescriptorImpl functionDescriptorImpl, TypeSubstitutor typeSubstitutor) {
        this.f186677b = functionDescriptorImpl;
        this.f186676a = typeSubstitutor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SmartList smartList = new SmartList();
        Iterator<? extends FunctionDescriptor> it8 = this.f186677b.getOverriddenDescriptors().iterator();
        while (it8.hasNext()) {
            smartList.add(it8.next().substitute(this.f186676a));
        }
        return smartList;
    }
}
