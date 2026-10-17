package com.revolut.core.ui_kit.delegates;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class dh {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final class b extends dh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f54054a = new b();

        private b() {
        }

        @Override // com.revolut.core.ui_kit.delegates.dh
        public final int a(int i) {
            return i;
        }
    }

    private dh() {
    }

    public abstract int a(int i);
}
