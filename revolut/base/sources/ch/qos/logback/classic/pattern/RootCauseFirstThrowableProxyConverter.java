package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public class RootCauseFirstThrowableProxyConverter extends ExtendedThrowableProxyConverter {
    public void recursiveAppendRootCauseFirst(StringBuilder sb6, String str, int i, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCause() != null) {
            recursiveAppendRootCauseFirst(sb6, str, i, iThrowableProxy.getCause());
            str = null;
        }
        ThrowableProxyUtil.indent(sb6, i - 1);
        if (str != null) {
            sb6.append(str);
        }
        ThrowableProxyUtil.subjoinFirstLineRootCauseFirst(sb6, iThrowableProxy);
        sb6.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb6, i, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppendRootCauseFirst(sb6, "Suppressed: ", i + 1, iThrowableProxy2);
            }
        }
    }

    @Override // ch.qos.logback.classic.pattern.ThrowableProxyConverter
    public String throwableProxyToString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb6 = new StringBuilder(2048);
        recursiveAppendRootCauseFirst(sb6, null, 1, iThrowableProxy);
        return sb6.toString();
    }
}
