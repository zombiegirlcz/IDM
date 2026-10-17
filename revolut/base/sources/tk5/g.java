package tk5;

import cli.n;
import cli.y;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoControllerContract$InputData;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoControllerContract$SheetPagerItem;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import md6.s;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends oki.h implements ali.h {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ali.b f271883p;

    public g(n stateMapper, CryptoMultichainInfoControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ArrayList arrayListI2 = I2();
        j jVar = inputData.f70972a;
        this.o = mra.d.b(this, new d(new CryptoMultichainInfoControllerContract$SheetPagerItem(jVar).f70974b, arrayListI2), stateMapper, null, false, 12);
        ali.b bVarB = s.b(this, new tj9.d(8));
        ArrayList<CryptoMultichainInfoControllerContract$SheetPagerItem> arrayListI22 = I2();
        for (CryptoMultichainInfoControllerContract$SheetPagerItem cryptoMultichainInfoControllerContract$SheetPagerItem : arrayListI22) {
            if (cryptoMultichainInfoControllerContract$SheetPagerItem.f70973a == jVar) {
                H2(this.o, new t8e.c(arrayListI22, cryptoMultichainInfoControllerContract$SheetPagerItem, 29));
                this.f271883p = bVarB;
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static ArrayList I2() {
        j[] jVarArrValues = j.values();
        ArrayList arrayList = new ArrayList(jVarArrValues.length);
        for (j jVar : jVarArrValues) {
            arrayList.add(new CryptoMultichainInfoControllerContract$SheetPagerItem(jVar));
        }
        return arrayList;
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f271883p;
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.o;
    }
}
