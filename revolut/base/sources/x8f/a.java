package x8f;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u8f.d;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public abstract void a(String str, d dVar);

    public abstract List b(String str, d dVar);

    public abstract void c(ArrayList arrayList);

    public void d(String accountId, d direction, ArrayList transferInstruments) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferInstruments, "transferInstruments");
        a(accountId, direction);
        c(transferInstruments);
    }
}
