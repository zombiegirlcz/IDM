package is6;

import androidx.room.RoomOpenDelegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.revolut.feature.freelancer.impl.database.FreelancerDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends RoomOpenDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FreelancerDatabase_Impl f168134a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(FreelancerDatabase_Impl freelancerDatabase_Impl) {
        super(36, "a81c16fca4b44dd50282fc327867545a", "44d71eee2ebab7ac35bc47ceae5d0c3d");
        this.f168134a = freelancerDatabase_Impl;
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void createAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `acquiring_orders` (`id` TEXT NOT NULL, `created_at` TEXT NOT NULL, `updated_at` TEXT NOT NULL, `status` TEXT, `channel` TEXT, `capture_mode` TEXT, `merchant_order_external_reference` TEXT, `description` TEXT, `readable_identifier` TEXT NOT NULL, `customer_note` TEXT, `custom_fields` TEXT, `customers` TEXT, `primary_payment` TEXT, `location` TEXT, `created_by_user` TEXT, `initiation_page` TEXT, `device` TEXT, `invoice` TEXT, `amount_amount` INTEGER NOT NULL, `amount_currency` TEXT NOT NULL, `tip_amount_amount` INTEGER, `tip_amount_currency` TEXT, `outstanding_amount_amount` INTEGER, `outstanding_amount_currency` TEXT, `discount_total_amount_amount` INTEGER, `discount_total_amount_currency` TEXT, `sub_total_amount_amount` INTEGER, `sub_total_amount_currency` TEXT, `tax_total_amount_amount` INTEGER, `tax_total_amount_currency` TEXT, `service_charge_amount_amount` INTEGER, `service_charge_amount_currency` TEXT, `surcharge_amount_amount` INTEGER, `surcharge_amount_currency` TEXT, `surcharge_tax_amount_amount` INTEGER, `surcharge_tax_amount_currency` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_acquiring_orders_created_at` ON `acquiring_orders` (`created_at`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `acquiring_payments` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `created_at` TEXT NOT NULL, `updated_at` TEXT, `settle_on` TEXT, `type` TEXT NOT NULL, `payment_method` TEXT NOT NULL, `card` TEXT, `sepa_last_four` TEXT, `fees` TEXT, `rolling_reserves` TEXT, `customer` TEXT, `order_id` TEXT, `billing_address` TEXT, `acquiring_reference_number` TEXT, `amount_amount` INTEGER NOT NULL, `amount_currency` TEXT NOT NULL, `tip_amount_amount` INTEGER NOT NULL, `tip_amount_currency` TEXT NOT NULL, `surcharge_amount_amount` INTEGER, `surcharge_amount_currency` TEXT, `net_amount_amount` INTEGER, `net_amount_currency` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_acquiring_payments_created_at` ON `acquiring_payments` (`created_at`)");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `business_category` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `isPopular` INTEGER NOT NULL, `description` TEXT, `keywords` TEXT, `logo_ref` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `customers` (`id` TEXT NOT NULL, `full_name` TEXT, `email` TEXT, `phone` TEXT, `vat_number` TEXT, `address` TEXT, `created_date` INTEGER NOT NULL, `updated_date` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `invoices` (`id` TEXT NOT NULL, `parentInvoiceId` TEXT, `number` TEXT NOT NULL, `numberFormatted` TEXT NOT NULL, `numberPrefix` TEXT NOT NULL, `saleDate` INTEGER, `issueDate` INTEGER, `dueDate` INTEGER, `currency` TEXT NOT NULL, `status` TEXT NOT NULL, `total` TEXT NOT NULL, `subtotal` TEXT NOT NULL, `totalTax` TEXT NOT NULL, `customerId` TEXT, `customerDetails` TEXT, `supplierDetails` TEXT, `statusDetails` TEXT, `enabledPaymentMethods` TEXT NOT NULL, `enabledReminders` TEXT NOT NULL, `taxes` TEXT NOT NULL, `items` TEXT NOT NULL, `additionalNote` TEXT, `customerMessage` TEXT, `recurringInvoiceId` TEXT, `recurringSchedule` TEXT, `templateId` TEXT, `templateOverride` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `invoice_tax_rates` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `percentage` REAL NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `orders` (`id` TEXT NOT NULL, `state` TEXT NOT NULL, `description` TEXT NOT NULL, `channel` TEXT NOT NULL, `channel_group` TEXT, `type` TEXT NOT NULL, `invoice` TEXT, `payment_link` TEXT, `amount` INTEGER NOT NULL, `currency` TEXT NOT NULL, `merchant_order_ext_ref` TEXT, `initiation_page_id` TEXT, `related_orders` TEXT, `related_transactions` TEXT, `original_order_details` TEXT, `line_items` TEXT, `payments` TEXT, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `expires_at` INTEGER NOT NULL, `allowed_payment_methods` TEXT, `customer_id` TEXT, `customer_email` TEXT, `customer_full_name` TEXT, `sub_total_amount_amount` INTEGER, `sub_total_amount_currency` TEXT, `tax_total_amount_amount` INTEGER, `tax_total_amount_currency` TEXT, `tip_amount_amount` INTEGER, `tip_amount_currency` TEXT, PRIMARY KEY(`id`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a81c16fca4b44dd50282fc327867545a')");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void dropAllTables(SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `acquiring_orders`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `acquiring_payments`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `business_category`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `customers`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `invoices`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `invoice_tax_rates`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `orders`");
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onCreate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        int i = FreelancerDatabase_Impl.f73510p;
        this.f168134a.internalInitInvalidationTracker(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPostMigrate(SQLiteConnection sQLiteConnection) {
    }

    @Override // androidx.room.RoomOpenDelegate
    public final void onPreMigrate(SQLiteConnection sQLiteConnection) {
        DBUtil.dropFtsSyncTriggers(sQLiteConnection);
    }

    @Override // androidx.room.RoomOpenDelegate
    public final RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
        HashMap map = new HashMap(36);
        map.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map.put("created_at", new TableInfo.Column("created_at", "TEXT", true, 0, null, 1));
        map.put("updated_at", new TableInfo.Column("updated_at", "TEXT", true, 0, null, 1));
        map.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, 1));
        map.put("channel", new TableInfo.Column("channel", "TEXT", false, 0, null, 1));
        map.put("capture_mode", new TableInfo.Column("capture_mode", "TEXT", false, 0, null, 1));
        map.put("merchant_order_external_reference", new TableInfo.Column("merchant_order_external_reference", "TEXT", false, 0, null, 1));
        map.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map.put("readable_identifier", new TableInfo.Column("readable_identifier", "TEXT", true, 0, null, 1));
        map.put("customer_note", new TableInfo.Column("customer_note", "TEXT", false, 0, null, 1));
        map.put("custom_fields", new TableInfo.Column("custom_fields", "TEXT", false, 0, null, 1));
        map.put("customers", new TableInfo.Column("customers", "TEXT", false, 0, null, 1));
        map.put("primary_payment", new TableInfo.Column("primary_payment", "TEXT", false, 0, null, 1));
        map.put("location", new TableInfo.Column("location", "TEXT", false, 0, null, 1));
        map.put("created_by_user", new TableInfo.Column("created_by_user", "TEXT", false, 0, null, 1));
        map.put("initiation_page", new TableInfo.Column("initiation_page", "TEXT", false, 0, null, 1));
        map.put("device", new TableInfo.Column("device", "TEXT", false, 0, null, 1));
        map.put("invoice", new TableInfo.Column("invoice", "TEXT", false, 0, null, 1));
        map.put("amount_amount", new TableInfo.Column("amount_amount", "INTEGER", true, 0, null, 1));
        map.put("amount_currency", new TableInfo.Column("amount_currency", "TEXT", true, 0, null, 1));
        map.put("tip_amount_amount", new TableInfo.Column("tip_amount_amount", "INTEGER", false, 0, null, 1));
        map.put("tip_amount_currency", new TableInfo.Column("tip_amount_currency", "TEXT", false, 0, null, 1));
        map.put("outstanding_amount_amount", new TableInfo.Column("outstanding_amount_amount", "INTEGER", false, 0, null, 1));
        map.put("outstanding_amount_currency", new TableInfo.Column("outstanding_amount_currency", "TEXT", false, 0, null, 1));
        map.put("discount_total_amount_amount", new TableInfo.Column("discount_total_amount_amount", "INTEGER", false, 0, null, 1));
        map.put("discount_total_amount_currency", new TableInfo.Column("discount_total_amount_currency", "TEXT", false, 0, null, 1));
        map.put("sub_total_amount_amount", new TableInfo.Column("sub_total_amount_amount", "INTEGER", false, 0, null, 1));
        map.put("sub_total_amount_currency", new TableInfo.Column("sub_total_amount_currency", "TEXT", false, 0, null, 1));
        map.put("tax_total_amount_amount", new TableInfo.Column("tax_total_amount_amount", "INTEGER", false, 0, null, 1));
        map.put("tax_total_amount_currency", new TableInfo.Column("tax_total_amount_currency", "TEXT", false, 0, null, 1));
        map.put("service_charge_amount_amount", new TableInfo.Column("service_charge_amount_amount", "INTEGER", false, 0, null, 1));
        map.put("service_charge_amount_currency", new TableInfo.Column("service_charge_amount_currency", "TEXT", false, 0, null, 1));
        map.put("surcharge_amount_amount", new TableInfo.Column("surcharge_amount_amount", "INTEGER", false, 0, null, 1));
        map.put("surcharge_amount_currency", new TableInfo.Column("surcharge_amount_currency", "TEXT", false, 0, null, 1));
        map.put("surcharge_tax_amount_amount", new TableInfo.Column("surcharge_tax_amount_amount", "INTEGER", false, 0, null, 1));
        HashSet hashSetS = prk.o.s(map, "surcharge_tax_amount_currency", new TableInfo.Column("surcharge_tax_amount_currency", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new TableInfo.Index("index_acquiring_orders_created_at", false, Arrays.asList("created_at"), Arrays.asList("ASC")));
        TableInfo tableInfo = new TableInfo("acquiring_orders", map, hashSetS, hashSet);
        TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "acquiring_orders");
        if (!tableInfo.equals(tableInfo2)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("acquiring_orders(com.revolut.feature.freelancer.impl.database.entities.AcquiringOrderEntity).\n Expected:\n", tableInfo, "\n Found:\n", tableInfo2));
        }
        HashMap map2 = new HashMap(23);
        map2.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map2.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map2.put("created_at", new TableInfo.Column("created_at", "TEXT", true, 0, null, 1));
        map2.put("updated_at", new TableInfo.Column("updated_at", "TEXT", false, 0, null, 1));
        map2.put("settle_on", new TableInfo.Column("settle_on", "TEXT", false, 0, null, 1));
        map2.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map2.put("payment_method", new TableInfo.Column("payment_method", "TEXT", true, 0, null, 1));
        map2.put("card", new TableInfo.Column("card", "TEXT", false, 0, null, 1));
        map2.put("sepa_last_four", new TableInfo.Column("sepa_last_four", "TEXT", false, 0, null, 1));
        map2.put("fees", new TableInfo.Column("fees", "TEXT", false, 0, null, 1));
        map2.put("rolling_reserves", new TableInfo.Column("rolling_reserves", "TEXT", false, 0, null, 1));
        map2.put("customer", new TableInfo.Column("customer", "TEXT", false, 0, null, 1));
        map2.put("order_id", new TableInfo.Column("order_id", "TEXT", false, 0, null, 1));
        map2.put("billing_address", new TableInfo.Column("billing_address", "TEXT", false, 0, null, 1));
        map2.put("acquiring_reference_number", new TableInfo.Column("acquiring_reference_number", "TEXT", false, 0, null, 1));
        map2.put("amount_amount", new TableInfo.Column("amount_amount", "INTEGER", true, 0, null, 1));
        map2.put("amount_currency", new TableInfo.Column("amount_currency", "TEXT", true, 0, null, 1));
        map2.put("tip_amount_amount", new TableInfo.Column("tip_amount_amount", "INTEGER", true, 0, null, 1));
        map2.put("tip_amount_currency", new TableInfo.Column("tip_amount_currency", "TEXT", true, 0, null, 1));
        map2.put("surcharge_amount_amount", new TableInfo.Column("surcharge_amount_amount", "INTEGER", false, 0, null, 1));
        map2.put("surcharge_amount_currency", new TableInfo.Column("surcharge_amount_currency", "TEXT", false, 0, null, 1));
        map2.put("net_amount_amount", new TableInfo.Column("net_amount_amount", "INTEGER", false, 0, null, 1));
        HashSet hashSetS2 = prk.o.s(map2, "net_amount_currency", new TableInfo.Column("net_amount_currency", "TEXT", false, 0, null, 1), 0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new TableInfo.Index("index_acquiring_payments_created_at", false, Arrays.asList("created_at"), Arrays.asList("ASC")));
        TableInfo tableInfo3 = new TableInfo("acquiring_payments", map2, hashSetS2, hashSet2);
        TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "acquiring_payments");
        if (!tableInfo3.equals(tableInfo4)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("acquiring_payments(com.revolut.feature.freelancer.impl.database.entities.AcquiringPaymentEntity).\n Expected:\n", tableInfo3, "\n Found:\n", tableInfo4));
        }
        HashMap map3 = new HashMap(6);
        map3.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map3.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        map3.put("isPopular", new TableInfo.Column("isPopular", "INTEGER", true, 0, null, 1));
        map3.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
        map3.put("keywords", new TableInfo.Column("keywords", "TEXT", false, 0, null, 1));
        TableInfo tableInfo5 = new TableInfo("business_category", map3, prk.o.s(map3, "logo_ref", new TableInfo.Column("logo_ref", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "business_category");
        if (!tableInfo5.equals(tableInfo6)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("business_category(com.revolut.feature.freelancer.impl.database.entities.BusinessCategoryEntity).\n Expected:\n", tableInfo5, "\n Found:\n", tableInfo6));
        }
        HashMap map4 = new HashMap(8);
        map4.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map4.put("full_name", new TableInfo.Column("full_name", "TEXT", false, 0, null, 1));
        map4.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, 1));
        map4.put("phone", new TableInfo.Column("phone", "TEXT", false, 0, null, 1));
        map4.put("vat_number", new TableInfo.Column("vat_number", "TEXT", false, 0, null, 1));
        map4.put("address", new TableInfo.Column("address", "TEXT", false, 0, null, 1));
        map4.put("created_date", new TableInfo.Column("created_date", "INTEGER", true, 0, null, 1));
        TableInfo tableInfo7 = new TableInfo("customers", map4, prk.o.s(map4, "updated_date", new TableInfo.Column("updated_date", "INTEGER", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "customers");
        if (!tableInfo7.equals(tableInfo8)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("customers(com.revolut.feature.freelancer.impl.database.entities.CustomerEntity).\n Expected:\n", tableInfo7, "\n Found:\n", tableInfo8));
        }
        HashMap map5 = new HashMap(27);
        map5.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map5.put("parentInvoiceId", new TableInfo.Column("parentInvoiceId", "TEXT", false, 0, null, 1));
        map5.put("number", new TableInfo.Column("number", "TEXT", true, 0, null, 1));
        map5.put("numberFormatted", new TableInfo.Column("numberFormatted", "TEXT", true, 0, null, 1));
        map5.put("numberPrefix", new TableInfo.Column("numberPrefix", "TEXT", true, 0, null, 1));
        map5.put("saleDate", new TableInfo.Column("saleDate", "INTEGER", false, 0, null, 1));
        map5.put("issueDate", new TableInfo.Column("issueDate", "INTEGER", false, 0, null, 1));
        map5.put("dueDate", new TableInfo.Column("dueDate", "INTEGER", false, 0, null, 1));
        map5.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map5.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
        map5.put("total", new TableInfo.Column("total", "TEXT", true, 0, null, 1));
        map5.put("subtotal", new TableInfo.Column("subtotal", "TEXT", true, 0, null, 1));
        map5.put("totalTax", new TableInfo.Column("totalTax", "TEXT", true, 0, null, 1));
        map5.put("customerId", new TableInfo.Column("customerId", "TEXT", false, 0, null, 1));
        map5.put("customerDetails", new TableInfo.Column("customerDetails", "TEXT", false, 0, null, 1));
        map5.put("supplierDetails", new TableInfo.Column("supplierDetails", "TEXT", false, 0, null, 1));
        map5.put("statusDetails", new TableInfo.Column("statusDetails", "TEXT", false, 0, null, 1));
        map5.put("enabledPaymentMethods", new TableInfo.Column("enabledPaymentMethods", "TEXT", true, 0, null, 1));
        map5.put("enabledReminders", new TableInfo.Column("enabledReminders", "TEXT", true, 0, null, 1));
        map5.put("taxes", new TableInfo.Column("taxes", "TEXT", true, 0, null, 1));
        map5.put("items", new TableInfo.Column("items", "TEXT", true, 0, null, 1));
        map5.put("additionalNote", new TableInfo.Column("additionalNote", "TEXT", false, 0, null, 1));
        map5.put("customerMessage", new TableInfo.Column("customerMessage", "TEXT", false, 0, null, 1));
        map5.put("recurringInvoiceId", new TableInfo.Column("recurringInvoiceId", "TEXT", false, 0, null, 1));
        map5.put("recurringSchedule", new TableInfo.Column("recurringSchedule", "TEXT", false, 0, null, 1));
        map5.put("templateId", new TableInfo.Column("templateId", "TEXT", false, 0, null, 1));
        TableInfo tableInfo9 = new TableInfo("invoices", map5, prk.o.s(map5, "templateOverride", new TableInfo.Column("templateOverride", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "invoices");
        if (!tableInfo9.equals(tableInfo10)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("invoices(com.revolut.feature.freelancer.impl.database.entities.InvoiceEntity).\n Expected:\n", tableInfo9, "\n Found:\n", tableInfo10));
        }
        HashMap map6 = new HashMap(3);
        map6.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map6.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
        TableInfo tableInfo11 = new TableInfo("invoice_tax_rates", map6, prk.o.s(map6, "percentage", new TableInfo.Column("percentage", "REAL", true, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "invoice_tax_rates");
        if (!tableInfo11.equals(tableInfo12)) {
            return new RoomOpenDelegate.ValidationResult(false, prk.o.o("invoice_tax_rates(com.revolut.feature.freelancer.impl.database.entities.InvoiceTaxRateEntity).\n Expected:\n", tableInfo11, "\n Found:\n", tableInfo12));
        }
        HashMap map7 = new HashMap(30);
        map7.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
        map7.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
        map7.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
        map7.put("channel", new TableInfo.Column("channel", "TEXT", true, 0, null, 1));
        map7.put("channel_group", new TableInfo.Column("channel_group", "TEXT", false, 0, null, 1));
        map7.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
        map7.put("invoice", new TableInfo.Column("invoice", "TEXT", false, 0, null, 1));
        map7.put("payment_link", new TableInfo.Column("payment_link", "TEXT", false, 0, null, 1));
        map7.put("amount", new TableInfo.Column("amount", "INTEGER", true, 0, null, 1));
        map7.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, 1));
        map7.put("merchant_order_ext_ref", new TableInfo.Column("merchant_order_ext_ref", "TEXT", false, 0, null, 1));
        map7.put("initiation_page_id", new TableInfo.Column("initiation_page_id", "TEXT", false, 0, null, 1));
        map7.put("related_orders", new TableInfo.Column("related_orders", "TEXT", false, 0, null, 1));
        map7.put("related_transactions", new TableInfo.Column("related_transactions", "TEXT", false, 0, null, 1));
        map7.put("original_order_details", new TableInfo.Column("original_order_details", "TEXT", false, 0, null, 1));
        map7.put("line_items", new TableInfo.Column("line_items", "TEXT", false, 0, null, 1));
        map7.put("payments", new TableInfo.Column("payments", "TEXT", false, 0, null, 1));
        map7.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, 1));
        map7.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, 1));
        map7.put("expires_at", new TableInfo.Column("expires_at", "INTEGER", true, 0, null, 1));
        map7.put("allowed_payment_methods", new TableInfo.Column("allowed_payment_methods", "TEXT", false, 0, null, 1));
        map7.put("customer_id", new TableInfo.Column("customer_id", "TEXT", false, 0, null, 1));
        map7.put("customer_email", new TableInfo.Column("customer_email", "TEXT", false, 0, null, 1));
        map7.put("customer_full_name", new TableInfo.Column("customer_full_name", "TEXT", false, 0, null, 1));
        map7.put("sub_total_amount_amount", new TableInfo.Column("sub_total_amount_amount", "INTEGER", false, 0, null, 1));
        map7.put("sub_total_amount_currency", new TableInfo.Column("sub_total_amount_currency", "TEXT", false, 0, null, 1));
        map7.put("tax_total_amount_amount", new TableInfo.Column("tax_total_amount_amount", "INTEGER", false, 0, null, 1));
        map7.put("tax_total_amount_currency", new TableInfo.Column("tax_total_amount_currency", "TEXT", false, 0, null, 1));
        map7.put("tip_amount_amount", new TableInfo.Column("tip_amount_amount", "INTEGER", false, 0, null, 1));
        TableInfo tableInfo13 = new TableInfo("orders", map7, prk.o.s(map7, "tip_amount_currency", new TableInfo.Column("tip_amount_currency", "TEXT", false, 0, null, 1), 0), new HashSet(0));
        TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "orders");
        return !tableInfo13.equals(tableInfo14) ? new RoomOpenDelegate.ValidationResult(false, prk.o.o("orders(com.revolut.feature.freelancer.impl.database.entities.OrderEntity).\n Expected:\n", tableInfo13, "\n Found:\n", tableInfo14)) : new RoomOpenDelegate.ValidationResult(true, null);
    }
}
