package sa1;

import com.revolut.feature.acquiring.card_reader.data.impl.domain.exception.CardReaderTimeoutException;
import com.youTransactor.uCube.rpc.RPCCommand;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class t {
    public static final efm.r a(RPCCommand rPCCommand, Function1 doOnSuccess, Function1 successDataProducer) {
        Intrinsics.checkNotNullParameter(rPCCommand, "<this>");
        Intrinsics.checkNotNullParameter(doOnSuccess, "doOnSuccess");
        Intrinsics.checkNotNullParameter(successDataProducer, "successDataProducer");
        efm.r rVarCreate = efm.r.create(new ag.p(rPCCommand, 16, successDataProducer, doOnSuccess));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        String message = rPCCommand.getClass().getSimpleName().concat(" command has timed out");
        Intrinsics.checkNotNullParameter(message, "message");
        efm.r rVarTimeout = rVarCreate.timeout(30L, timeUnit, efm.r.error(new CardReaderTimeoutException(message)));
        Intrinsics.checkNotNullExpressionValue(rVarTimeout, "timeout(...)");
        return rVarTimeout;
    }

    public static /* synthetic */ efm.r b(RPCCommand rPCCommand, Function1 function1, int i) {
        s8h.h hVar = new s8h.h(11);
        if ((i & 2) != 0) {
            function1 = new s8h.h(12);
        }
        return a(rPCCommand, hVar, function1);
    }
}
