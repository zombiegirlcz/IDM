package ch.qos.logback.core.recovery;

import ch.qos.logback.core.net.SyslogOutputStream;
import j6.a;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes16.dex */
public class ResilientSyslogOutputStream extends ResilientOutputStreamBase {
    int port;
    String syslogHost;

    public ResilientSyslogOutputStream(String str, int i) throws SocketException, UnknownHostException {
        this.syslogHost = str;
        this.port = i;
        this.f24077os = new SyslogOutputStream(str, i);
        this.presumedClean = true;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public String getDescription() {
        StringBuilder sb6 = new StringBuilder("syslog [");
        sb6.append(this.syslogHost);
        sb6.append(":");
        return a.v(sb6, "]", this.port);
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public OutputStream openNewOutputStream() throws IOException {
        return new SyslogOutputStream(this.syslogHost, this.port);
    }

    public String toString() {
        return "c.q.l.c.recovery.ResilientSyslogOutputStream@" + System.identityHashCode(this);
    }
}
