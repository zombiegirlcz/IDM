package ch.qos.logback.core;

import ch.qos.logback.core.joran.spi.ConsoleTarget;
import ch.qos.logback.core.status.WarnStatus;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public class ConsoleAppender<E> extends OutputStreamAppender<E> {
    protected ConsoleTarget target = ConsoleTarget.SystemOut;

    private void targetWarn(String str) {
        StringBuilder sbX = a.x("[", str, "] should be one of ");
        sbX.append(Arrays.toString(ConsoleTarget.values()));
        WarnStatus warnStatus = new WarnStatus(sbX.toString(), this);
        warnStatus.add(new WarnStatus("Using previously set target, System.out by default.", this));
        addStatus(warnStatus);
    }

    public String getTarget() {
        return this.target.getName();
    }

    public void setTarget(String str) {
        ConsoleTarget consoleTargetFindByName = ConsoleTarget.findByName(str.trim());
        if (consoleTargetFindByName == null) {
            targetWarn(str);
        } else {
            this.target = consoleTargetFindByName;
        }
    }

    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        setOutputStream(this.target.getStream());
        super.start();
    }
}
