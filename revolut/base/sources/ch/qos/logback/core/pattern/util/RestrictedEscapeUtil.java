package ch.qos.logback.core.pattern.util;

/* JADX INFO: loaded from: classes.dex */
public class RestrictedEscapeUtil implements IEscapeUtil {
    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c2, int i) {
        if (str.indexOf(c2) >= 0) {
            stringBuffer.append(c2);
        } else {
            stringBuffer.append("\\");
            stringBuffer.append(c2);
        }
    }
}
