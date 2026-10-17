package fjm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StorageManager f135681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SupertypeLoopChecker f135682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractTypeParameterDescriptor f135683c;

    public b(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
        this.f135683c = abstractTypeParameterDescriptor;
        this.f135681a = storageManager;
        this.f135682b = supertypeLoopChecker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new d(this.f135683c, this.f135681a, this.f135682b);
    }
}
