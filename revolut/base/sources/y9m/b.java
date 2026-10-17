package y9m;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import gim.i;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Continuation continuation) {
        super(2, continuation);
        this.u = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws GeneralSecurityException, IOException {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = this.u;
        Context applicationContext = eVar.f311876a.f112589b.getApplicationContext();
        MasterKey masterKeyBuild = new MasterKey.Builder(applicationContext, "_financial_atomic_transact_storage_mk_").setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();
        Intrinsics.checkNotNullExpressionValue(masterKeyBuild, "Builder(context, MASTER_…\n                .build()");
        SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(applicationContext, "financial.atomic.transact.storage", masterKeyBuild, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "create(\n                ….AES256_GCM\n            )");
        eVar.f311877b.U(sharedPreferencesCreate);
        return Unit.f186387a;
    }
}
