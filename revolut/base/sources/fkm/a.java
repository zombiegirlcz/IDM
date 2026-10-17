package fkm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends g {
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Object obj2) {
        super(lockBasedStorageManager, function0);
        this.d = obj2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.c
    public final dki.h c(boolean z) {
        return dki.h.z(this.d);
    }
}
