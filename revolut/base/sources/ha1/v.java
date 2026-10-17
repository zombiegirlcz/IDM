package ha1;

import com.youTransactor.uCube.rpc.command.EnterSecureSessionCommand;
import com.youTransactor.uCube.rpc.command.ExitSecureSessionCommand;
import com.youTransactor.uCube.rpc.command.InstallForLoadCommand;
import com.youTransactor.uCube.rpc.command.LoadCommand;
import com.youTransactor.uCube.rpc.command.SetInfoFieldCommand;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa1.d f150392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl0.a f150393b;

    public v(sa1.d sdkAdapter, tl0.a base64Util) {
        Intrinsics.checkNotNullParameter(sdkAdapter, "sdkAdapter");
        Intrinsics.checkNotNullParameter(base64Util, "base64Util");
        this.f150392a = sdkAdapter;
        this.f150393b = base64Util;
    }

    public final pfm.a a() {
        efm.b bVarB = b();
        ((sa1.q) this.f150392a).getClass();
        pfm.a aVarE = bVarB.e(pw5.a.g(sa1.t.b(new EnterSecureSessionCommand(), null, 3)).ignoreElements());
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final efm.b b() {
        ((sa1.q) this.f150392a).getClass();
        efm.b bVarIgnoreElements = pw5.a.g(sa1.t.b(new ExitSecureSessionCommand(), null, 3)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    public final efm.r c() {
        sa1.q qVar = (sa1.q) this.f150392a;
        qVar.getClass();
        return pw5.a.g(sa1.t.b(new ta1.b(), new sa1.j(qVar, 2), 1));
    }

    public final sfm.b d() {
        efm.b bVarB = b();
        sa1.q qVar = (sa1.q) this.f150392a;
        qVar.getClass();
        sfm.b bVarG = bVarB.g(pw5.a.g(sa1.t.b(new EnterSecureSessionCommand(), new sa1.j(qVar, 3), 1)));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        return bVarG;
    }

    public final efm.b e(byte[] signature, byte[] cipheredKey) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(cipheredKey, "cipheredKey");
        ((sa1.q) this.f150392a).getClass();
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(cipheredKey, "cipheredKey");
        InstallForLoadCommand installForLoadCommand = new InstallForLoadCommand();
        installForLoadCommand.setEncryptionMethod((byte) 1);
        installForLoadCommand.setSignature(signature);
        installForLoadCommand.setCipheredKey(cipheredKey);
        efm.b bVarIgnoreElements = pw5.a.g(sa1.t.b(installForLoadCommand, null, 3)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    public final efm.r f(ArrayList binaryBlocks) {
        Intrinsics.checkNotNullParameter(binaryBlocks, "binaryBlocks");
        ((sa1.q) this.f150392a).getClass();
        Intrinsics.checkNotNullParameter(binaryBlocks, "binaryBlocks");
        efm.r rVarB = sa1.t.b(new LoadCommand(binaryBlocks), null, 3);
        Intrinsics.checkNotNullParameter(rVarB, "<this>");
        efm.r rVarFlatMap = rVarB.flatMap(new u3a.q(new u8c.c(12), 25));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    public final efm.b g(String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        byte[] payload2 = this.f150393b.a(payload);
        ((sa1.q) this.f150392a).getClass();
        Intrinsics.checkNotNullParameter(payload2, "payload");
        efm.b bVarIgnoreElements = pw5.a.g(sa1.t.b(new ta1.a(payload2), null, 3)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    public final efm.r h(List payloads) {
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        efm.r rVarConcatMap = efm.r.fromIterable(payloads).doOnSubscribe(new s(1, new k(10))).concatMap(new s(2, new h56.a(this, 14)));
        Intrinsics.checkNotNullExpressionValue(rVarConcatMap, "concatMap(...)");
        return rVarConcatMap;
    }

    public final pfm.a i(String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        efm.b bVarB = b();
        ((sa1.q) this.f150392a).getClass();
        Intrinsics.checkNotNullParameter(locale, "locale");
        ea1.b.a("SetInfoFieldCommand: locale = " + locale + ", powerTimeout = -1", fa1.k.INFO);
        SetInfoFieldCommand setInfoFieldCommand = new SetInfoFieldCommand();
        setInfoFieldCommand.setMerchantLocale(locale);
        setInfoFieldCommand.setPowerTimeout((byte) -1);
        pfm.a aVarE = bVarB.e(pw5.a.g(sa1.t.b(setInfoFieldCommand, null, 3)).ignoreElements());
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
