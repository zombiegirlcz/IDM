package com.revolut.core.error.data.model;

import com.revolut.core.error.data.model.ServerErrorException;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a {
    public static final ServerErrorException a(HttpException httpException) {
        Intrinsics.checkNotNullParameter(httpException, "<this>");
        ServerErrorException.INSTANCE.getClass();
        return ServerErrorException.Companion.c(httpException, (o) ServerErrorException.i.getValue());
    }
}
