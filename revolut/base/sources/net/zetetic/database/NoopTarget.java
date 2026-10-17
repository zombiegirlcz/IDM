package net.zetetic.database;

/* JADX INFO: loaded from: classes14.dex */
public class NoopTarget implements LogTarget {
    @Override // net.zetetic.database.LogTarget
    public final boolean a(String str, int i) {
        return false;
    }

    @Override // net.zetetic.database.LogTarget
    public final void b(int i, String str, String str2, Exception exc2) {
    }
}
