package io.grpc;

import ecm.g2;

/* JADX INFO: loaded from: classes13.dex */
public class StatusException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f162991a;

    public StatusException(g2 g2Var) {
        super(g2.b(g2Var), g2Var.f124811c, true, true);
        this.f162991a = g2Var;
    }
}
