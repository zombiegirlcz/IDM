package fye;

import com.revolut.feature.external_accounts.api.model.Mandate;
import kotlin.jvm.internal.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a extends h0 {
    public static final a f = new a();

    public a() {
        super(Mandate.class, "institutionId", "getInstitutionId()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.internal.h0, wim.p
    public final Object get(Object obj2) {
        return ((Mandate) obj2).f72225b;
    }
}
