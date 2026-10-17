package an5;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.crypto.tfr.validation.api.navigation.TfrValidationFlowContract$InputData;
import com.revolut.feature.crypto.tfr.validation.api.navigation.destination.CryptoTfrDateOfBirthValidationDestination;
import com.revolut.feature.crypto.tfr.validation.api.navigation.destination.CryptoTfrLegalEntityIdValidationDestination;
import com.revolut.feature.crypto.tfr.validation.api.navigation.destination.CryptoTfrMeshValidationDestination;
import com.revolut.feature.crypto.tfr.validation.impl.flow.TfrValidationFlow;
import km5.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof lm5.a)) {
            return null;
        }
        lm5.a aVar = (lm5.a) descriptor;
        return aVar.a(new TfrValidationFlow(aVar.b()));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoTfrMeshValidationDestination) {
            CryptoTfrMeshValidationDestination cryptoTfrMeshValidationDestination = (CryptoTfrMeshValidationDestination) destination;
            return new TfrValidationFlow(new TfrValidationFlowContract$InputData(cryptoTfrMeshValidationDestination.getF71029a(), f.MESH, null, cryptoTfrMeshValidationDestination.getF71030b()));
        }
        if (destination instanceof CryptoTfrDateOfBirthValidationDestination) {
            CryptoTfrDateOfBirthValidationDestination cryptoTfrDateOfBirthValidationDestination = (CryptoTfrDateOfBirthValidationDestination) destination;
            return new TfrValidationFlow(new TfrValidationFlowContract$InputData(cryptoTfrDateOfBirthValidationDestination.getF71023a(), f.DATE_PLACE_OF_BIRTH, cryptoTfrDateOfBirthValidationDestination.getF71024b(), cryptoTfrDateOfBirthValidationDestination.getF71025c()));
        }
        if (!(destination instanceof CryptoTfrLegalEntityIdValidationDestination)) {
            return null;
        }
        CryptoTfrLegalEntityIdValidationDestination cryptoTfrLegalEntityIdValidationDestination = (CryptoTfrLegalEntityIdValidationDestination) destination;
        return new TfrValidationFlow(new TfrValidationFlowContract$InputData(cryptoTfrLegalEntityIdValidationDestination.getF71026a(), f.LEGAL_ENTITY_ID, cryptoTfrLegalEntityIdValidationDestination.getF71027b(), cryptoTfrLegalEntityIdValidationDestination.getF71028c()));
    }
}
