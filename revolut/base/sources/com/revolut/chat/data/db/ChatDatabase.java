package com.revolut.chat.data.db;

import androidx.room.RoomDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r10.d;
import r10.f;
import r10.g;
import r10.q;
import r10.r;
import r10.t;
import r10.v;
import r10.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/chat/data/db/ChatDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "a", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChatDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.chat.data.db.ChatDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public abstract r10.a g();

    public abstract d h();

    public abstract f i();

    public abstract g j();

    public abstract t k();

    public abstract v l();

    public abstract q m();

    public abstract w n();

    public abstract r o();
}
