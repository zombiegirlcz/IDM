package sa1;

import com.youTransactor.uCube.rpc.command.GetInfosCommand;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha1.v f261218a;

    public c(ha1.v rpcCommandsDataSource) {
        Intrinsics.checkNotNullParameter(rpcCommandsDataSource, "rpcCommandsDataSource");
        this.f261218a = rpcCommandsDataSource;
    }

    public static void b(int i, byte[] bArr) {
        Boolean boolValueOf;
        String strI = null;
        if (bArr != null) {
            boolValueOf = Boolean.valueOf(bArr.length == 0);
        } else {
            boolValueOf = null;
        }
        if (pd.b.k(boolValueOf)) {
            strI = "empty";
        } else if (bArr != null) {
            strI = jli.g.i(bArr);
        }
        Regex regex = jli.g.f175847a;
        String hexString = Integer.toHexString(i);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        ea1.b.a("EMV system failure info tag [" + hexString + "] = " + strI, fa1.k.ERROR);
    }

    public static String c(int[] iArr) {
        return kotlin.collections.d.c0(iArr, null, new s8h.h(8), 25);
    }

    public final pfm.t a(int... iArr) {
        efm.b bVarIgnoreElements = pw5.a.g(t.b(new GetInfosCommand(Arrays.copyOf(iArr, iArr.length)), new s8h.h(7), 1)).doOnNext(new s65.o(new kpi.b(this, iArr), 22)).ignoreElements();
        dfm.c cVar = mfm.f.f205044g;
        bVarIgnoreElements.getClass();
        pfm.a aVar = new pfm.a(bVarIgnoreElements, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
        return ea1.b.c(aVar, p.a.p("Fetching ", c(iArr), " tag"), fa1.k.ERROR);
    }
}
