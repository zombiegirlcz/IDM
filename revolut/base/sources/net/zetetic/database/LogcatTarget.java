package net.zetetic.database;

import android.util.Log;

/* JADX INFO: loaded from: classes14.dex */
public class LogcatTarget implements LogTarget {
    @Override // net.zetetic.database.LogTarget
    public final boolean a(String str, int i) {
        return Log.isLoggable(str, i);
    }

    @Override // net.zetetic.database.LogTarget
    public final void b(int i, String str, String str2, Exception exc2) {
        switch (i) {
        }
    }
}
