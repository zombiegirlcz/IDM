package ch.qos.logback.classic.db;

import a0.d;
import ch.qos.logback.classic.db.names.ColumnName;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.TableName;
import wp5.y;

/* JADX INFO: loaded from: classes16.dex */
public class SQLBuilder {
    public static String buildCreateExceptionTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb6 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb6.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_EXCEPTION));
        sb6.append(" (");
        ColumnName columnName = ColumnName.EVENT_ID;
        y.A(dBNameResolver, columnName, sb6, " BIGINT NOT NULL, ");
        ColumnName columnName2 = ColumnName.I;
        y.A(dBNameResolver, columnName2, sb6, " SMALLINT NOT NULL, ");
        sb6.append(dBNameResolver.getColumnName(ColumnName.TRACE_LINE));
        sb6.append(" VARCHAR(254) NOT NULL, PRIMARY KEY (");
        sb6.append(dBNameResolver.getColumnName(columnName));
        sb6.append(", ");
        sb6.append(dBNameResolver.getColumnName(columnName2));
        sb6.append("), FOREIGN KEY (");
        y.A(dBNameResolver, columnName, sb6, ") REFERENCES ");
        sb6.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb6.append(" (");
        sb6.append(dBNameResolver.getColumnName(columnName));
        sb6.append(") )");
        return sb6.toString();
    }

    public static String buildCreateLoggingEventTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb6 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb6.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb6.append(" (");
        y.A(dBNameResolver, ColumnName.TIMESTMP, sb6, " BIGINT NOT NULL, ");
        y.A(dBNameResolver, ColumnName.FORMATTED_MESSAGE, sb6, " TEXT NOT NULL, ");
        y.A(dBNameResolver, ColumnName.LOGGER_NAME, sb6, " VARCHAR(254) NOT NULL, ");
        y.A(dBNameResolver, ColumnName.LEVEL_STRING, sb6, " VARCHAR(254) NOT NULL, ");
        y.A(dBNameResolver, ColumnName.THREAD_NAME, sb6, " VARCHAR(254), ");
        y.A(dBNameResolver, ColumnName.REFERENCE_FLAG, sb6, " SMALLINT, ");
        y.A(dBNameResolver, ColumnName.ARG0, sb6, " VARCHAR(254), ");
        y.A(dBNameResolver, ColumnName.ARG1, sb6, " VARCHAR(254), ");
        y.A(dBNameResolver, ColumnName.ARG2, sb6, " VARCHAR(254), ");
        y.A(dBNameResolver, ColumnName.ARG3, sb6, " VARCHAR(254), ");
        y.A(dBNameResolver, ColumnName.CALLER_FILENAME, sb6, " VARCHAR(254), ");
        y.A(dBNameResolver, ColumnName.CALLER_CLASS, sb6, " VARCHAR(254), ");
        y.A(dBNameResolver, ColumnName.CALLER_METHOD, sb6, " VARCHAR(254), ");
        y.A(dBNameResolver, ColumnName.CALLER_LINE, sb6, " CHAR(4), ");
        sb6.append(dBNameResolver.getColumnName(ColumnName.EVENT_ID));
        sb6.append(" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT)");
        return sb6.toString();
    }

    public static String buildCreatePropertyTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb6 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb6.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_PROPERTY));
        sb6.append(" (");
        ColumnName columnName = ColumnName.EVENT_ID;
        y.A(dBNameResolver, columnName, sb6, " BIGINT NOT NULL, ");
        ColumnName columnName2 = ColumnName.MAPPED_KEY;
        y.A(dBNameResolver, columnName2, sb6, " VARCHAR(254) NOT NULL, ");
        sb6.append(dBNameResolver.getColumnName(ColumnName.MAPPED_VALUE));
        sb6.append(" VARCHAR(254) NOT NULL, PRIMARY KEY (");
        sb6.append(dBNameResolver.getColumnName(columnName));
        sb6.append(", ");
        sb6.append(dBNameResolver.getColumnName(columnName2));
        sb6.append("), FOREIGN KEY (");
        y.A(dBNameResolver, columnName, sb6, ") REFERENCES ");
        sb6.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb6.append(" (");
        sb6.append(dBNameResolver.getColumnName(columnName));
        sb6.append(") )");
        return sb6.toString();
    }

    public static String buildDeleteExpiredLogsSQL(DBNameResolver dBNameResolver, long j2) {
        StringBuilder sb6 = new StringBuilder("DELETE FROM ");
        sb6.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb6.append(" WHERE ");
        y.A(dBNameResolver, ColumnName.TIMESTMP, sb6, " <= ");
        return d.j(j2, ";", sb6);
    }

    public static String buildInsertExceptionSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb6 = new StringBuilder("INSERT INTO ");
        sb6.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_EXCEPTION));
        sb6.append(" (");
        y.A(dBNameResolver, ColumnName.EVENT_ID, sb6, ", ");
        y.A(dBNameResolver, ColumnName.I, sb6, ", ");
        sb6.append(dBNameResolver.getColumnName(ColumnName.TRACE_LINE));
        sb6.append(") VALUES (?, ?, ?)");
        return sb6.toString();
    }

    public static String buildInsertPropertiesSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb6 = new StringBuilder("INSERT INTO ");
        sb6.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_PROPERTY));
        sb6.append(" (");
        y.A(dBNameResolver, ColumnName.EVENT_ID, sb6, ", ");
        y.A(dBNameResolver, ColumnName.MAPPED_KEY, sb6, ", ");
        sb6.append(dBNameResolver.getColumnName(ColumnName.MAPPED_VALUE));
        sb6.append(") VALUES (?, ?, ?)");
        return sb6.toString();
    }

    public static String buildInsertSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb6 = new StringBuilder("INSERT INTO ");
        sb6.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb6.append(" (");
        y.A(dBNameResolver, ColumnName.TIMESTMP, sb6, ", ");
        y.A(dBNameResolver, ColumnName.FORMATTED_MESSAGE, sb6, ", ");
        y.A(dBNameResolver, ColumnName.LOGGER_NAME, sb6, ", ");
        y.A(dBNameResolver, ColumnName.LEVEL_STRING, sb6, ", ");
        y.A(dBNameResolver, ColumnName.THREAD_NAME, sb6, ", ");
        y.A(dBNameResolver, ColumnName.REFERENCE_FLAG, sb6, ", ");
        y.A(dBNameResolver, ColumnName.ARG0, sb6, ", ");
        y.A(dBNameResolver, ColumnName.ARG1, sb6, ", ");
        y.A(dBNameResolver, ColumnName.ARG2, sb6, ", ");
        y.A(dBNameResolver, ColumnName.ARG3, sb6, ", ");
        y.A(dBNameResolver, ColumnName.CALLER_FILENAME, sb6, ", ");
        y.A(dBNameResolver, ColumnName.CALLER_CLASS, sb6, ", ");
        y.A(dBNameResolver, ColumnName.CALLER_METHOD, sb6, ", ");
        sb6.append(dBNameResolver.getColumnName(ColumnName.CALLER_LINE));
        sb6.append(") VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        return sb6.toString();
    }
}
