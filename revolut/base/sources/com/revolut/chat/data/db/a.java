package com.revolut.chat.data.db;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import od0.e;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatDatabase f50994b;

    public a(Context context, ChatDatabase chatDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(chatDatabase, "chatDatabase");
        this.f50993a = context;
        this.f50994b = chatDatabase;
    }

    @Override // od0.e
    public final void clear() {
        ChatDatabase.INSTANCE.getClass();
        Context context = this.f50993a;
        Intrinsics.checkNotNullParameter(context, "context");
        ChatDatabase database = this.f50994b;
        Intrinsics.checkNotNullParameter(database, "database");
        ce0.a.a(context, "revolut_chat_storage.sqlite", database);
    }
}
