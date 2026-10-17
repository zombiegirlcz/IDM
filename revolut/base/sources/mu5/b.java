package mu5;

import com.revolut.feature.crypto_investments.api.model.CombinedPocketsBalance;
import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ del.f f208963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r39.a f208964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f208965c;
    public final /* synthetic */ LinkedHashMap d;

    public b(del.f fVar, r39.a aVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f208963a = fVar;
        this.f208964b = aVar;
        this.f208965c = linkedHashMap;
        this.d = linkedHashMap2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Comparable comparableA;
        Comparable comparableA2;
        CombinedPocketsBalance combinedPocketsBalance = (CombinedPocketsBalance) obj2;
        del.f fVar = this.f208963a;
        del.d dVar = fVar.f113714a;
        int[] iArr = a.f208961a;
        int i = iArr[dVar.ordinal()];
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.f208965c;
        r39.a aVar = this.f208964b;
        if (i == 1) {
            comparableA = combinedPocketsBalance.f71374b;
        } else if (i == 2) {
            comparableA = r39.a.a(aVar, combinedPocketsBalance, linkedHashMap2, linkedHashMap);
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Sort commodities by products it not supported");
            }
            comparableA = combinedPocketsBalance.f71375c.f71376a.f163163a.d;
        }
        CombinedPocketsBalance combinedPocketsBalance2 = (CombinedPocketsBalance) obj3;
        int i2 = iArr[fVar.f113714a.ordinal()];
        if (i2 == 1) {
            comparableA2 = combinedPocketsBalance2.f71374b;
        } else if (i2 == 2) {
            comparableA2 = r39.a.a(aVar, combinedPocketsBalance2, linkedHashMap2, linkedHashMap);
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Sort commodities by products it not supported");
            }
            comparableA2 = combinedPocketsBalance2.f71375c.f71376a.f163163a.d;
        }
        return cim.b.b(comparableA, comparableA2);
    }
}
