package br9;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final oq9.d a(Long l2, Long l3) {
        return (l2 == null || l2.longValue() <= 0) ? (l3 == null || l3.longValue() <= 0) ? oq9.d.SETTLED : oq9.d.OWED : oq9.d.OWE;
    }
}
