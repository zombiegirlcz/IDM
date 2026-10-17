package cog;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f25541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f25542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f25543c;

    public a(c defaultNameValidator, g usLeadBankLastNameValidator, e nameMaxLengthValidator) {
        Intrinsics.checkNotNullParameter(defaultNameValidator, "defaultNameValidator");
        Intrinsics.checkNotNullParameter(usLeadBankLastNameValidator, "usLeadBankLastNameValidator");
        Intrinsics.checkNotNullParameter(nameMaxLengthValidator, "nameMaxLengthValidator");
        this.f25541a = defaultNameValidator;
        this.f25542b = usLeadBankLastNameValidator;
        this.f25543c = nameMaxLengthValidator;
    }

    @Override // cog.f
    public final boolean a(zng.g domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(this.f25541a, this.f25542b, this.f25543c);
        if (!(listK instanceof Collection) || !listK.isEmpty()) {
            Iterator it8 = listK.iterator();
            while (it8.hasNext()) {
                if (!((f) it8.next()).a(domainState)) {
                    return false;
                }
            }
        }
        return true;
    }
}
