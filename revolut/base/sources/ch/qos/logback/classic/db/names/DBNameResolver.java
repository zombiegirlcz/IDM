package ch.qos.logback.classic.db.names;

/* JADX INFO: loaded from: classes16.dex */
public interface DBNameResolver {
    <N extends Enum<?>> String getColumnName(N n3);

    <N extends Enum<?>> String getTableName(N n3);
}
