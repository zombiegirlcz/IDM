package gn6;

import com.revolut.domain.models.openbanking.instructions.InstitutionInstructions;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExternalInstitution f144924b;

    public /* synthetic */ h(ExternalInstitution externalInstitution, int i) {
        this.f144923a = i;
        this.f144924b = externalInstitution;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f144923a) {
            case 0:
                io3.b bVar = this.f144924b.f66109c;
                InstitutionInstructions instructions = ((d) obj2).f144915a;
                Intrinsics.checkNotNullParameter(instructions, "instructions");
                return new d(instructions, bVar);
            default:
                ExternalInstitution externalInstitution = this.f144924b;
                return rn6.d.a((rn6.d) obj2, null, externalInstitution.d, externalInstitution.f66109c, 1);
        }
    }
}
