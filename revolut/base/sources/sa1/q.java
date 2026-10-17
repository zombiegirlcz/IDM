package sa1;

import android.content.Context;
import com.youTransactor.uCube.connexion.IConnexionManager;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.command.GetInfosCommand;
import efm.d0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements d {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f261236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl0.a f261237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma1.j f261238c;
    public final ne0.n d;
    public final ma1.f e;
    public final oa1.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d4m.a f261239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.b f261240h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Set f261241j;
    public final p k;

    public q(Context context, tl0.a base64Util, ma1.j cardReaderPairingStateReceiver, ne0.n chargeStateCache, ma1.f bluetoothRequirementsChecker, oa1.d youTransactorLogger, d4m.a connectionManagerProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(base64Util, "base64Util");
        Intrinsics.checkNotNullParameter(cardReaderPairingStateReceiver, "cardReaderPairingStateReceiver");
        Intrinsics.checkNotNullParameter(chargeStateCache, "chargeStateCache");
        Intrinsics.checkNotNullParameter(bluetoothRequirementsChecker, "bluetoothRequirementsChecker");
        Intrinsics.checkNotNullParameter(youTransactorLogger, "youTransactorLogger");
        Intrinsics.checkNotNullParameter(connectionManagerProvider, "connectionManagerProvider");
        this.f261236a = context;
        this.f261237b = base64Util;
        this.f261238c = cardReaderPairingStateReceiver;
        this.d = chargeStateCache;
        this.e = bluetoothRequirementsChecker;
        this.f = youTransactorLogger;
        this.f261239g = connectionManagerProvider;
        this.f261240h = j6.a.h("create(...)");
        this.i = v0.a.d("create(...)");
        this.f261241j = new LinkedHashSet();
        this.k = new p(this);
    }

    public final d0 a() {
        d0 d0VarFirstOrError = pw5.a.g(t.b(new GetInfosCommand(Constants.TAG_BATTERY_STATE, Constants.TAG_FB_CHARGING_STATUS, Constants.TAG_FIRMWARE_VERSION), new j(this, 1), 1)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final IConnexionManager b() {
        Object obj2 = this.f261239g.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (IConnexionManager) obj2;
    }
}
